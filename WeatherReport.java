import java.io.*;
import java.util.*;

public class WeatherReport {
    public static void main(String[] args) {
        // Data structures to hold cumulative sums for each district's temperature,
        // humidity, and rain
        Map<Integer, List<Integer>> temperatureData = new HashMap<>();
        Map<Integer, List<Integer>> humidityData = new HashMap<>();
        Map<Integer, List<Integer>> rainData = new HashMap<>();

        // Initialize lists for each district (1 to 64)
        for (int i = 1; i <= 64; i++) {
            temperatureData.put(i, new ArrayList<>());
            humidityData.put(i, new ArrayList<>());
            rainData.put(i, new ArrayList<>());
        }

        // Read the data from the file
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into parts
                String[] parts = line.split("\\s+");
                int districtId = Integer.parseInt(parts[0]); // Parse district ID
                int temperature = Integer.parseInt(parts[2]); // Parse temperature
                int humidity = Integer.parseInt(parts[3]); // Parse humidity
                int rain = Integer.parseInt(parts[4]); // Parse rain

                // Add the values to the respective lists for the district
                temperatureData.get(districtId).add(temperature);
                humidityData.get(districtId).add(humidity);
                rainData.get(districtId).add(rain);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Calculate averages and write to files
        writeAveragesToFile("temperature.txt", temperatureData);
        writeAveragesToFile("humidity.txt", humidityData);
        writeAveragesToFile("rain.txt", rainData);
    }

    /**
     * Helper method to calculate averages and write them to a file.
     *
     * @param fileName The name of the file to write to.
     * @param data     The data to process.
     */
    private static void writeAveragesToFile(String fileName, Map<Integer, List<Integer>> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // Iterate over each district (1 to 64)
            for (int districtId = 1; districtId <= 64; districtId++) {
                // Get the list of values for the current district
                List<Integer> values = data.get(districtId);
                // Calculate the average value
                double average = values.stream().mapToInt(Integer::intValue).average().orElse(0);
                // Write the district ID and the average value to the file
                bw.write(districtId + " " + average);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
