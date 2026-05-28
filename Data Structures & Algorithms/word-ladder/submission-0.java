
class Pair{
    String word;
    int depth;
   Pair(String word,int depth)
    {
        this.word = word;
        this.depth = depth;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>(wordList);
        Queue<Pair> queue = new LinkedList<>();
        if(beginWord.equals(endWord)) return 0;
        queue.add(new Pair(beginWord,1));

        Set<String> visited = new HashSet<>();
        while(!queue.isEmpty())
        {
           int size = queue.size();
           for(int k = 0;k<size;k++)
           {
           Pair p = queue.poll();
           for(int i=0;i<p.word.length();i++)
           {
              for(char c = 'a';c<='z';c++)
              {
                 if(c== p.word.charAt(i)) continue;
                 String nei = p.word.substring(0,i)+c+p.word.substring(i+1);
                 if(s.contains(nei) && !visited.contains(nei))
                 {
                    visited.add(nei);
                    if(nei.equals(endWord)) return p.depth+1;
                    queue.add(new Pair(nei,p.depth+1));


                 }


              }
           }
           }
        }
        return 0;
        

    }
}
