class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s: strs)
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String sort = Arrays.toString(ch);
            res.putIfAbsent(sort, new ArrayList<String>());
            res.get(sort).add(s);


        }
        return new ArrayList<>(res.values());
    }
}
