public class Codec {
    HashMap hm = new HashMap();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String s = String.valueOf(System.currentTimeMillis()); 
        hm.put(s,longUrl);
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return String.valueOf(hm.get(shortUrl));   
    }
}
