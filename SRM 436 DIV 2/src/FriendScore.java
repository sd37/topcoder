import java.util.*;
import java.math.*;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class FriendScore
{
    public static int count = 0;

    public int highestScore(String[] friends)
    {

        int N = friends.length;
        var adjList = ConvertToAdjList(friends);
        int depth = 2;
        int maxTwoFriendCount = 0;

        for (int i = 0; i < N; i++)
        {
            count = 0;
            Set<Integer> seen = new HashSet<>();
            DFS(adjList, i, depth, seen);

            maxTwoFriendCount = Math.max(maxTwoFriendCount, count);
        }

        return maxTwoFriendCount;
    }

    private void DFS(List<List<Integer>> adjList, int friendId, int depth, Set<Integer> seen)
    {
        seen.add(friendId);

        if (depth < 1)
        {
            return;
        }

        var neighbors = adjList.get(friendId).stream().filter(x -> !seen.contains(x)).collect(Collectors.toList());
        depth--;

        for (int neighbor :
                neighbors)
        {
            if (!seen.contains(neighbor))
            {
                // cycle detection.
                count++;
            }
            DFS(adjList, neighbor, depth, seen);
        }
    }

    private List<List<Integer>> ConvertToAdjList(String[] friends)
    {
        int N = friends.length;
        int M = friends[0].length();

        var adjList = new ArrayList<List<Integer>>();

        for (int i = 0; i < N; i++)
        {
            adjList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                char ch = friends[i].charAt(j);
                if (ch == 'Y')
                {
                    adjList.get(i).add(j);
                }
            }
        }

        return adjList;
    }
}
