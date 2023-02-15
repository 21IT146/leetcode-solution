class Solution {
    public int numberOfSteps(int num) {
        int count=0;

    for(int i=0; num > 0 ; i++)
    {
      if(num%2 == 0)
      {
        num = num/2;
        count++;
      }
      else
      {
        num=num-1;
        count++;
      }
    }
    return count;      
    }
}
