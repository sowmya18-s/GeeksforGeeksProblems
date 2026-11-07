class Solution {
    public String booleanOperations(boolean a, boolean b) {
        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notResult = !a;

        // Returning the results separated by spaces
        return andResult + " " + orResult + " " + notResult;
    }
}