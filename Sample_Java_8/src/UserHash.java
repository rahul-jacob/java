
public class UserHash {

	public static void main(String[] args) {
		String userId = "991122465";
		System.out.println("Hash value of "+userId+" is "+idHash(userId));
//991122462 =>2d39303831323535373831313934373139323535
//991122465 =>2d323535353834333339383539323335323137		
	}
	
	public static String idHash(String id)
    {
        StringBuffer hashStr = new StringBuffer();
        String str = id;
        int i = 33;
        int step = 2;
        int numChars = 25;

        while (hashStr.length() < numChars)
        {
            hashStr.append((char) (i * hashStr.length() + step + str.charAt(hashStr.length() % str.length())));
        }

        str = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);

        int start = str.length() - (str.length() / 2 - str.length() / 4);

        hashStr.replace(start, start + str.length(), str);

        long hash = 5381;
        for (i = hashStr.length() - 1; i >= 0; i--)
        {
            hash = ((hash << 5) + hash + 31) + hashStr.charAt(i);
        }

        byte[] mdBytes = String.valueOf(hash).getBytes();

        StringBuffer hexString = new StringBuffer();

        for (i = 0; i < mdBytes.length; i++)
        {
            String hex = Integer.toHexString(0xff & mdBytes[i]);
            if ( hex.length() == 1 ) hexString.append('0');
            hexString.append(hex);
        }

        String theHash = hexString.toString();
        return theHash;
    }

}
