1class Solution {
2    public int romanToInt(String s) {
3        
4        int answer = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            
8            int current = value(s.charAt(i));
9
10            if (i + 1 < s.length() && current < value(s.charAt(i + 1))) {
11                answer -= current;
12            } else {
13                answer += current;
14            }
15        }
16
17        return answer;
18    }
19
20    public int value(char c) {
21        switch (c) {
22            case 'I': return 1;
23            case 'V': return 5;
24            case 'X': return 10;
25            case 'L': return 50;
26            case 'C': return 100;
27            case 'D': return 500;
28            case 'M': return 1000;
29        }
30
31        return 0;
32    }
33}