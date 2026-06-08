/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/268/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Stack, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-08T18:44:42.047Z
 */

············}·else·{
················int·v·=·stack.pop();
················int·top·=·stack.pop();

················if·(v·==·0)·{
····················stack.push(top·+·1);
················}·else·{
····················stack.push(top·+·2·*·v);
················}
············}
········}

········return·stack.pop();
····}
}
