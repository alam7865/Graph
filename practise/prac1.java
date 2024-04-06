import java.util.*;
public class prac1 {
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }


    public static void bfs(ArrayList<Edge>[] graph)
    {
        Queue<Integer>q=new LinkedList<>();
        boolean visit[]=new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr=q.remove();

            if(!visit[curr])
            {
                System.out.print(curr+" ");
                visit[curr]=true;

                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
           
        }
    }
    public static void main(String[] args) {
        
        int v=7;
        ArrayList<Edge>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }

        // 0 -vertex
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 5));
        // 1 -vertex
        graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -vertex
        graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,4,1));
        // 4 -vertex
        graph[4].add(new Edge(4,2,2));
        graph[4].add(new Edge(4, 5, 5));
        graph[4].add(new Edge(4, 3, 5));

        // 5 -vertex
        graph[5].add(new Edge(5, 3, 5));
        graph[5].add(new Edge(5, 4, 5));
        graph[5].add(new Edge(5, 6, 5));

        // 6 -vertex
        graph[6].add(new Edge(6, 5, 5));

        // for(int i=0;i<graph[2].size();i++)
        // {
        //     Edge e=graph[2].get(i);
        //     System.out.println(e.des);
        // }

        bfs(graph);
    }
}
