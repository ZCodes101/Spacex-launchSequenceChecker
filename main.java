boolean solution(String[] systemNames, int[] stepNumbers) {
    // Create a HashMap to store the maximum step number for each system.
    HashMap<String, Integer> maxStepNums = new HashMap<>();

    // Iterate through the input arrays.
    for (int i = 0; i < systemNames.length; i++) {
        String sysName = systemNames[i]; // Get the name of the current system.
        int stepNum = stepNumbers[i];    // Get the step number for the current system.

        // Check if the system name is already in the HashMap and if the step number is less than or equal to the maximum.
        if (maxStepNums.containsKey(sysName) && stepNum <= maxStepNums.get(sysName)) {
            return false; // If the condition is met, return false.
        }

        // Otherwise, update the maximum step number for the current system in the HashMap.
        maxStepNums.put(sysName, stepNum);
    }

    // If all systems have unique and increasing step numbers, return true.
    return true;
}
