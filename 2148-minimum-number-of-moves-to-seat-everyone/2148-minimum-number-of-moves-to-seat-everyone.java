class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     Arrays.sort(seats);
     Arrays.sort(students);
     int s=0;
     for(int i=0;i<students.length;i++){
        int k=Math.abs(students[i]-seats[i]);
        s=s+k;
     }
     return s;
    }
}