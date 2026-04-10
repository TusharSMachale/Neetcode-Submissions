class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;
        for(int i=0; i<seats.length; i++){
            if(students[i] > seats[i]){
                count += students[i] - seats[i];
            }else if(students[i] < seats[i]){
                count += seats[i] - students[i];
            }
        }
        return count;
    }
}