import java.util.Map;

class Solution {
  public String intToRoman(int num) {

    String result = "";

    while(num > 0) {

      int maxVal = Solution.getMaxVal(num);
      result += Solution.symbolFromVal.get(maxVal);
      num -= maxVal;

    }

    return result;
  }

  public static int getMaxVal(int num) {
    if (num >= 1000) return 1000;
    else if (num >= 900) return 900;
    else if (num >= 500) return 500;
    else if (num >= 400) return 400;
    else if (num >= 100) return 100;
    else if (num >= 90) return 90;
    else if (num >= 50) return 50;
    else if (num >= 40) return 40;
    else if (num >= 10) return 10;
    else if (num >= 9) return 9;
    else if (num >= 5) return 5;
    else if (num >= 4) return 4;
    else return 1;
  }

  static Map<Integer, String> symbolFromVal = Map.ofEntries(
    Map.entry(1000, "M"),
    Map.entry(900, "CM"),
    Map.entry(500, "D"),
    Map.entry(400, "CD"),
    Map.entry(100, "C"),
    Map.entry(90, "XC"),
    Map.entry(50, "L"),
    Map.entry(40, "XL"),
    Map.entry(10, "X"),
    Map.entry(9, "IX"),
    Map.entry(5, "V"),
    Map.entry(4, "IV"),
    Map.entry(1, "I")
  );
}