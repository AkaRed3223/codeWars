package leetCode.easy;

public class DefangIpAddress {

    public static String defangIPaddress(String address) {
        char[] arr = address.toCharArray();
        StringBuilder finalStr = new StringBuilder();
        for (char c : arr) {
            if (c == '.') finalStr.append("[.]");
            else finalStr.append(c);
        }
        return finalStr.toString();
    }
}
