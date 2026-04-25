class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<List<String>>();
        Arrays.sort(strs);
        //int start_idx = 0;
        int n = strs.length;
        boolean visited[] = new boolean[n];
        for(int start_idx=0;start_idx<n;start_idx++)
        {
          if(visited[start_idx]==true) continue;
          char [] ch = strs[start_idx].toCharArray();
          HashMap<Character,Integer> left = new HashMap<Character,Integer>();
          List<String> ana = new ArrayList<>();
          ana.add(strs[start_idx]);
          visited[start_idx]=true;
          for(int i=0;i<ch.length;i++)
          {
             left.put(ch[i],left.getOrDefault(ch[i],0)+1);
          }
          int current_idx=start_idx;
          int j=start_idx+1;

          while(j<n)
          {

            char [] r = strs[j].toCharArray();
            int f=0;
            HashMap<Character,Integer> right = new HashMap<Character,Integer>();
            if(r.length!=ch.length)
            {
                j=j+1;
                continue;
            }
            for(int k=0;k<r.length;k++)
            {
            if(!left.containsKey(r[k])) 
            {
                f=1;
                break;
                
            }
            right.put(r[k],right.getOrDefault(r[k],0)+1);

            }
            if(left.equals(right))
            {
                
                ana.add(strs[j]);
                visited[j]=true;
               // start_idx=j+1;
            }
            j++;
           }
           groups.add(ana);
          // start_idx = Math.max(start_idx,current_idx+1);
           
        }
       
        return groups;
    }
}
