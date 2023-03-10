class Solution {
public int minMovesToSeat(int[] seats, int[] students) {
int ans=0;
Arrays.sort(seats);//sorting array
Arrays.sort(students);

    for(int i=0;i<seats.length;i++)
    {
        int dif=Math.abs(seats[i]-students[i]);//Math.abs for avoiding negative value
        ans+=dif;//add answer
    }
    return ans;
}
