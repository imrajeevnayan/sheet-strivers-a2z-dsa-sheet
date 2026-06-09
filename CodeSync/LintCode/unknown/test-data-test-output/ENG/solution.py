# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/268/
# Language: Python
# Difficulty: Unknown
# Topics: Stack, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-09T12:21:52.695Z

public·class·Solution·{
····public·int·parenthesesScore(String·s)·{
········Stack<Integer>·st=·new·Stack<>();
········st.push(0);

········for·(char·c·:·s.toCharArray())·{
············if·(c·==·'(')·st.push(0);
············else·{
················int·v·=·st.pop();
················int·top·=·st.pop();

················if·(v·==·0)·st.push(top·+·1);
················else·st.push(top·+·2·*·v);
············}
········}

········return·st.pop();
····}
}
