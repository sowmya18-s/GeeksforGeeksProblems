class Solution {
    public String findDay(int Date,int Month,int Year) {
        Calendar cal=Calendar.getInstance();
        cal.set(Year,Month-1,Date);
        String[] days={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
}