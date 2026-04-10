class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int n = str.length();
            sb.append(n);
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '#'){
                s.append(str.charAt(i));
            }else{
                int a = Integer.parseInt(s.toString());
                list.add(str.substring(i+1, a+i+1));
                s.setLength(0);
                i = i + a;
            }
        }
        return list;
    }
}
