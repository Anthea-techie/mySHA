import java.security.*;
class Main
{
public static void main(String[] a)
{
try
{
MessageDigest mds=MessageDigest.getInstance("SHA1");
System.out.println("Message digest: ");
System.out.println(" Used Algorithm ="+mds.getAlgorithm());
System.out.println(" Provider for the algorithm ="+mds.getProvider());
System.out.println(" Convert it toString ="+mds.toString());
String input = "";
mds.update(input.getBytes());
byte[] output = mds.digest();
System.out.print("SHA1(\""+input+"\") =");
System.out.println(" "+bytesToHex(output));
input = "abcd";
mds.update(input.getBytes());
output = mds.digest();
System.out.print("SHA1(\""+input+"\") =");
System.out.println(" "+bytesToHex(output));
input = "anthea dafydo aswin";
mds.update(input.getBytes());
output = mds.digest();
System.out.print("SHA1(\""+input+"\") =");
System.out.println(" "+bytesToHex(output));
}
catch (Exception e)
{
System.out.println("Exception: "+e);
}
}
public static String bytesToHex(byte[] b)
{
char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7','8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
StringBuffer buf = new StringBuffer();
for (int j=0; j<b.length; j++) {
buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
buf.append(hexDigit[b[j] & 0x0f]);
}
return buf.toString();
}
}
