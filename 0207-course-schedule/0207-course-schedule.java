import java.util.*;

class Solution {
    public boolean isCycle(int course, List<Integer>[] adjList, boolean[] vis, boolean[] res) {
        vis[course] = true;
        res[course] = true;

        for (int neighbor : adjList[course]) {
            if (!vis[neighbor]) {
                if (isCycle(neighbor, adjList, vis, res)) {
                    return true;
                }
            } else if (res[neighbor]) {
                return true;
            }
        }

        res[course] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adjList = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            adjList[course].add(prerequisiteCourse);
        }

        boolean[] vis = new boolean[numCourses];
        boolean[] res = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (isCycle(i, adjList, vis, res)) {
                    return false;
                }
            }
        }

        return true;
    }
}
