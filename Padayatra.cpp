#include<bits/stdc++.h>

using namespace std;
# define INF 100000

struct Edge
{
int u;

int vi

int weight;
};
class Graph
{


int V;

list < pair <int, int >>"adj; vector< Edge > edge;

public:

Graph( int V)
{
this->VV;

adj new list < pair <int, int > >[V];

} 
void addEdge ( int u, int v, int w); 
void removeEdge( int u, int v, int w);
int ShortestPath (int u, int v); 
void RemoveEdge( int u, int v);
int FindMinimumCycle ();
};
void Graph:: addEdge ( int u, int v, int w)
{
adj[v].push_back(make_pair( v, w));
adj[v].push_back(make_pair( u, w));

Edge e{u, v, w); 
edge.push_back(e);

} 
void Graph:: remove Edge ( int u, int v, int w)
{
adj[u].remove(make_pair(v, w)); 
adj[v].remove(make_pair(u, w ));
}
int Graph :: ShortestPath (int u, int v)
{
set pair<int, int> > setds; 
vector<int> dist(V, INF); 
setds.insert(make_pair(0, u));

dist[u] = 0; 
while (!setds.empty())
{
setds.erase(setds.begin()); 
int u tmp.second;

pair<int, int> tmp =*(setds.begin());
 list< pair<int, int> >::iterator i; 
for (i adj[u].begin(); i !- adj[u].end(); ++i)
{
int v (i).first;

int weight (1).second;

if (dist[v]> dist[u] weight)
{
if (dist[v] - INF) 
setds.erase(setds.find(make_pair(dist[v], v)));
setds.insert(make pair(dist[v], v));
}
}
}
return dist[v];
}
int Graph:: FindMinimumCycle ()
{
int min cycle INT MAX; 
int E=edge.size();
for (int i=0; i < E; i++)
{
Edge e edge[1];

removeEdge( e.u, e.v, e.weight); int vistance Shortest Path e.u, e.v );

min cycle min( min_cycle, vistance + e.weight );

addEdge( e.u, e.v, e.weight);
}
return min_cycle;
}
int main()
{
int n; 
cin>>n; 
int V-350; 
int s,t,d; 
cin>>s>>t>>d;

Graph 8(350); 
for(int i=0;i<n;i++){

g.addEdge(s, t,d);
}
int a-g.FindMinimum Cycle(); 
cout<<<<endl; 
return 0;
}
