class Solution {
public:
    int minOperations(vector<string>& logs) {
         stack<int>st;
            cout << st.size();
        for(int i=0; i<logs.size(); i++) {
            if(logs[i] == "../") {if(!st.empty()) st.pop();}
            else if(logs[i] == "./") continue;
            else st.push(0);
        }
         return st.size();
    }
};