public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if(x >= ary.length){
      return sum;
    }
    for(int i = 0; i < ary[x].length; i ++){
      sum += ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x){
    int sum = 0;
    for(int i = 0; i < ary.length; i++){
      if(ary[i].length > x){
        sum += ary[i][x];
      }
      else{
        sum += 0;
      }
    }
  return sum;
}
  public static int[] allRowSums(int[][] ary){
    int[] ary2 = new int [ary.length];
    for(int i = 0; i < ary2.length; i++){
      ary2[i] = rowSum(ary, i);
    }
    return ary2;
  }
  public static int[] allColSums(int[][] ary){
    int longest = 0;
    for(int i = 0; i < ary.length; i ++){
      if(ary[i].length > longest){
        longest = ary[i].length;
      }
    }
    int [] ary2 = new int [longest];
    for(int i = 0; i < longest; i++){
      ary2[i] = columnSum(ary,i);
    }
    return ary2;
  }
  public static boolean isRowMagic(int[][] ary){
    int count = 0;
    for(int i = 0; i < ary.length; i ++){
      int x = rowSum(ary, i);
      if(i == 0){
        count = x;
      }
      if(count != x){
        return false;
      }
    }
    return true;
  }
  public static boolean isColumnMagic(int[][] ary){
    int count = 0;
    for(int i = 0; i < ary[i].length; i ++){
      int x = columnSum(ary, i);
      if(i == 0){
        count = x;
      }
      if(count != x){
        return false;
      }
    }
    return true;
  }

}
