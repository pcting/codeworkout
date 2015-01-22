package com.patrickting.codeworkout;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Vector;

/* Top Coder Problem: http://community.topcoder.com/stat?c=problem_statement&pm=884&rd=4493 */
public class Criminal {
  public static void main(String[] args) {
    assertEquals(3, numPseudonyms(new String[] {"FRANK BOB", "FRANK GEORGE"}, new String[] {"WILLARD GREG", "GEORGE WILLARD"} ));
    assertEquals(-1, numPseudonyms(new String[] {"ADAM FRANK", "BOB SUZY"}, new String[] {"BRETT GEORGE", "BRETT TOM"} ));
    assertEquals(-1, numPseudonyms(new String[] {"HARRY LLOYD", "GEORGE BILL"}, new String[] {"FRANK THOMAS", "GEORGE WILL", "WILL FRANK"} ));
    assertEquals(7, numPseudonyms(new String[] {"TIM BOB", "BOB SUE", "SUE AAA", "BBB CCC", "CCC DDD", "DDD BBB"}, new String[] {"A B", "B C", "C D", "AAA BBB", "BBB CCC", "CCC AAA"} ));
    assertEquals(6, numPseudonyms(new String[] {"A B", "B C", "C A", "AA BB", "BB CC", "CC AA"}, new String[] {"A B", "B C", "C A", "AA BB", "BB CC", "CC AA"} ));
    assertEquals(7, numPseudonyms(new String[] {"A B", "B C", "C A", "AA BB", "BB CC", "CC DD", "DD AA"}, new String[] {"A B", "B C", "C A", "AA BB", "BB CC", "CC DD", "DD AA"} ));
    assertEquals(8, numPseudonyms(new String[] {"A B", "A C", "A D", "AA BB", "AA CC", "AA DD"}, new String[] {"A B", "A C", "A D", "AA BB", "AA CC", "AA DD"} ));
    assertEquals(5, numPseudonyms(new String[] {"A B", "A C", "AA BB", "AA CC", "AA DD"}, new String[] {"A B", "A C", "AA BB", "AA CC", "AA DD"} ));
    assertEquals(2, numPseudonyms(new String[] {"A B", "A C", "B D", "B E"}, new String[] {"A B", "A C", "B D", "B E"} ));
    assertEquals(8, numPseudonyms(new String[] {"A B", "B C", "C D", "D E", "E F", "F G", "G H"}, new String[] {"A B", "B C", "C D", "D E", "E F", "F G", "G H"} ));
    assertEquals(-1, numPseudonyms(new String[] {"C E", "A B", "G D", "C A", "C D", "G E", "A G", "F E", "G H"}, new String[] {"B H", "A E", "D C", "H A", "E C", "D A", "F E", "F A", "D G"} ));
    assertEquals(8, numPseudonyms(new String[] {"H G", "E F", "D A", "C G", "B A", "A G", "E G"}, new String[] {"A F", "B F", "C F", "C E", "C H", "G H", "C D"} ));
    assertEquals(6, numPseudonyms(new String[] {"E B", "A F", "B A", "G F", "A D"}, new String[] {"B E", "C A", "B C", "G B", "G D"} ));
    assertEquals(5, numPseudonyms(new String[] {"G E", "C A", "H E", "H G", "G C"}, new String[] {"G B", "D B", "D C", "C A", "D A"} ));
    assertEquals(6, numPseudonyms(new String[] {"E G", "D B", "H F", "E F", "B E"}, new String[] {"A G", "E H", "C G", "C E", "D C"} ));
    assertEquals(6, numPseudonyms(new String[] {"A C", "F A", "C E", "C B", "G B"}, new String[] {"A C", "H B", "C F", "A G", "A B"} ));
    assertEquals(-1, numPseudonyms(new String[] {"H A", "B E", "B F", "A D", "A G", "F E"}, new String[] {"A H", "B H", "H D", "F G", "C A", "G B"} ));
    assertEquals(-1, numPseudonyms(new String[] {"G F", "F D", "A G", "E F", "G B", "D B", "E H"}, new String[] {"H D", "G H", "E A", "E B", "E D", "A C", "D G"} ));
    assertEquals(-1, numPseudonyms(new String[] {"G E", "C B", "D H", "H A", "B A", "B D", "G A", "H C", "C E", "A C", "G H", "F H", "B G", "E D", "B E", "E F", "F C", "D G", "D F"}, new String[] {"D A", "G E", "H F", "D H", "H E", "B F", "F G", "B A", "C B", "E F", "A G", "F C", "C E", "F A", "C G", "B E", "F D", "A E", "D E"} ));
    assertEquals(-1, numPseudonyms(new String[] {"D A", "B E", "C H", "F C", "C E", "B G", "A F", "F E", "B C", "G A", "D F", "C A"}, new String[] {"E F", "F C", "H C", "G A", "G E", "F B", "E C", "B E", "G H", "H B", "A D", "C A"} ));
    assertEquals(-1, numPseudonyms(new String[] {"E G", "G H", "G F", "H D", "D A", "B G", "D C", "F C", "E H"}, new String[] {"C F", "D E", "D C", "A D", "G F", "H E", "H C", "A B", "A E"} ));
    assertEquals(-1, numPseudonyms(new String[] {"G H", "A G", "C A", "G C", "E F", "G F", "D H", "F B"}, new String[] {"D H", "B C", "F A", "E C", "F D", "F B", "G A", "H F"} ));
    assertEquals(-1, numPseudonyms(new String[] {"D B", "A F", "D F", "G E", "G H", "G A", "B A"}, new String[] {"F H", "C D", "A G", "H A", "D F", "H D", "C B"} ));
    assertEquals(-1, numPseudonyms(new String[] {"G B", "E B", "H D", "C F", "E H", "F A", "C D"}, new String[] {"B A", "B E", "A C", "G A", "D H", "F C", "A D"} ));
    assertEquals(-1, numPseudonyms(new String[] {"A D", "B D", "G C", "H B", "D E", "B C", "F D", "F B", "G F", "D G", "E H", "E G", "E C"}, new String[] {"H D", "G C", "D C", "D B", "C H", "A H", "H F", "E F", "E H", "C B", "C A", "G A", "E C"} ));
    assertEquals(-1, numPseudonyms(new String[] {"D B", "D H", "C A", "G E", "G D", "H B", "B F"}, new String[] {"H A", "H G", "B D", "F A", "G F", "G C", "E H"} ));
    assertEquals(-1, numPseudonyms(new String[] {"B H", "C H", "A C", "B G", "E C", "A F", "H G", "A H", "G E", "B C"}, new String[] {"E D", "F E", "B D", "B A", "H E", "B C", "F B", "C E", "B H", "H F"} ));
    assertEquals(-1, numPseudonyms(new String[] {"G D", "D C", "H A", "A G", "G H", "B F", "H C", "C E", "D A", "E G", "G B", "F G", "F C", "D E", "B D"}, new String[] {"B G", "H E", "F H", "D G", "B E", "C D", "F D", "G A", "D B", "F A", "D A", "F C", "E A", "H D", "E C"} ));
    assertEquals(-1, numPseudonyms(new String[] {"B H", "A H", "A C", "C E", "B C", "A E", "H F", "E D", "H D", "C F", "A F", "H C", "B E", "A D", "G C", "F G"}, new String[] {"D B", "B E", "F H", "F G", "C H", "H B", "F B", "G D", "A C", "A H", "A F", "H G", "E F", "A E", "G B", "G C"} ));
    assertEquals(-1, numPseudonyms(new String[] {"E D", "E C", "G D", "A C", "H D", "C H", "H F", "G B", "D F", "C D", "D A", "H E", "B A", "E B"}, new String[] {"H G", "G D", "A D", "A G", "D E", "C H", "A F", "F D", "B E", "E A", "G F", "A B", "H A", "G B"} ));
    assertEquals(-1, numPseudonyms(new String[] {"A H", "C F", "B H", "H C", "D C", "A C", "C G", "C E", "D G", "B F", "F G", "A G", "E G", "B E", "D H"}, new String[] {"C B", "C F", "B D", "F D", "F E", "F G", "G D", "E G", "D H", "A B", "E B", "B G", "F B", "E A", "H C"} ));
    assertEquals(-1, numPseudonyms(new String[] {"B F", "D H", "C A", "C E", "E D", "B E", "C G", "A B", "B G", "D C", "B C", "G E", "A F", "D A", "H E", "B D", "H A", "F C"}, new String[] {"G H", "H E", "F H", "G D", "D C", "B D", "F G", "B C", "D A", "G B", "A E", "B H", "G A", "B F", "C H", "D H", "D E", "F E"} ));
    assertEquals(2, numPseudonyms(new String[] {"A B"}, new String[] {"A B"} ));
    assertEquals(8, numPseudonyms(new String[] {"A B", "A C", "A D", "A E", "A F", "A G", "A H", "B C", "B D", "B E", "B F", "B G", "B H", "C D", "C E", "C F", "C G", "C H", "D E", "D F", "D G", "D H", "E F", "E G", "E H", "F G", "F H", "G H"}, new String[] {"A B", "A C", "A D", "A E", "A F", "A G", "A H", "B C", "B D", "B E", "B F", "B G", "B H", "C D", "C E", "C F", "C G", "C H", "D E", "D F", "D G", "D H", "E F", "E G", "E H", "F G", "F H", "G H"} ));
    assertEquals(8, numPseudonyms(new String[] {"A B", "A D", "A F", "A G", "A H", "C B", "C H", "D C", "D F", "E B", "E F", "E G", "G D", "H B", "H F"}, new String[] {"C A", "C B", "D A", "D C", "E B", "E D", "F E", "G A", "G B", "G C", "G E", "G F", "H A", "H B", "H F"} ));
    assertEquals(-1, numPseudonyms(new String[] {"STEVE BRETT", "STEVE LARS", "STEVE JAMES"}, new String[] {"SCHVEIGUY ADMINBRETT", "ADMINBRETT LBACKSTROM", "LBACKSTROM STEVEVAI"} ));
    assertEquals(-1, numPseudonyms(new String[] {"A B", "B C", "C A", "A D", "B D", "C D", "E F", "F G", "G E", "E D", "F D", "G D"}, new String[] {"A B", "B C", "C D", "D E", "E F", "F A", "A G", "B G", "C G", "D G", "E G", "F G"} ));
    assertEquals(-1, numPseudonyms(new String[] {"A D", "A E", "A F", "B D", "B E", "B F", "C D", "C E", "C F"}, new String[] {"A D", "A E", "A F", "B D", "B E", "B F", "C D", "C E", "C B"} ));
    assertEquals(2, numPseudonyms(new String[] {"A B", "B C", "C D", "C E"}, new String[] {"A B", "B C", "C D", "C E"} ));
    assertEquals(0, numPseudonyms(new String[] {"A B", "B C", "C D", "C E", "D E", "E F"}, new String[] {"A B", "B C", "C D", "C E", "D E", "E F"} ));
  }

  public static boolean adjacencyEquals(boolean[][] x, boolean[][] y) {
    if (x.length != y.length) {
      return false;
    }

    int size = x.length;

    // should be a square matrix
    for(int i=0; i<size; i++) {
      for(int j=0; j<size; j++) {
        if(x[i][j] != y[i][j]) {
          return false;
        }
      }
    }

    return true;
  }

  public static Vector<Graph> permutate(Graph g) {

    Vector<Graph> graphs = new Vector<Graph>();

    heapPermutation(graphs, new Graph(g), g.names.size());

    return graphs;
  }

  // Heap's Algorithm: http://en.wikipedia.org/wiki/Heap%27s_algorithm
  public static void heapPermutation(Vector<Graph> graphs, Graph g, int n) {
    if (n == 1) {
      graphs.add(new Graph(g));
    } else {
      for(int i=0; i<n; i++) {
        heapPermutation(graphs, g, n - 1);
        int j = ((n % 2) == 0) ? i : 0;
        swapAdjacency(g, j, n - 1);
      }
    }
  }

  public static int numPseudonyms(String[] database, String[] fieldData) {

    Graph db = convertToGraph(database);
    Graph fd = convertToGraph(fieldData);

    // vertex count must be the same
    if (db.names.size() != fd.names.size()) {
      return -1;
    }

    // neighbor edge count must be the same
    if (db.edgeCount != fd.edgeCount) {
      return -1;
    }

    // rotate adjacency matrix around to test equality
    return findMaxAliases(db, fd);
  }

  public static int findMaxAliases(Graph x, Graph y) {

    int size = x.names.size();
    int maxAliases = -1;
    // int foundCount = 0;

    Vector<Graph> graphs = permutate(x);

    for(Graph g : graphs) {
      if (adjacencyEquals(g.adjacency, y.adjacency)) {
        // foundCount++;

        int aliases = countAliases(g.names, y.names);

        if (aliases > maxAliases) {
          maxAliases = aliases;
        }
      }
    }

    // out.println("found " + foundCount + "/" + graphs.size());

    return maxAliases;
  }

  public static void swapAdjacency(Graph g, int i, int j) {
    int size = g.names.size();

    // swap names
    String t = g.names.get(i);
    g.names.set(i, g.names.get(j));
    g.names.set(j, t);

    // swap horizontally
    boolean[] tmp = g.adjacency[i];
    g.adjacency[i] = g.adjacency[j];
    g.adjacency[j] = tmp;

    // swap vertically
    for (int n=0; n<size; n++) {
      boolean v = g.adjacency[n][i];
      g.adjacency[n][i] = g.adjacency[n][j];
      g.adjacency[n][j] = v;
    }
  }

  public static int countAliases(Vector<String> x, Vector<String> y) {

    int aliases = 0;

    for(int i=0; i<x.size(); i++) {
      if (!x.get(i).equals(y.get(i))) {
        aliases++;
      }
    }

    return aliases;

  }

  public static Graph convertToGraph(String[] pairs) {

    Vector<String> names = new Vector<String>();

    for(String p : pairs) {
      String[] toks = p.split(" ");

      if (!names.contains(toks[0])) {
        names.add(toks[0]);
      }

      if (!names.contains(toks[1])) {
        names.add(toks[1]);
      }
    }

    int size = names.size();

    assertTrue("Too many names!", size <= 8);

    // allocate space for adjacency matrix
    boolean[][] adjacency = new boolean[size][];

    for(int i=0; i<adjacency.length; i++) {
      adjacency[i] = new boolean[size];
    }

    int edgeCount = 0;

    for(String p : pairs) {
      String[] toks = p.split(" ");

      int t1 = names.indexOf(toks[0]);
      int t2 = names.indexOf(toks[1]);

      adjacency[t1][t2] = true;
      adjacency[t2][t1] = true;

      edgeCount += 2;
    }

    Graph g = new Graph();
    g.names = names;
    g.adjacency = adjacency;
    g.edgeCount = edgeCount;
    return g;
  }
}

class Graph {
  public Graph() {}

  public Graph(Graph copy) {

    // copy edge counts;
    edgeCount = copy.edgeCount;

    // copy the names
    names = new Vector<String>(copy.names);

    int size = names.size();

    // create empty adjacency matrix
    adjacency = new boolean[size][];

    for(int i=0; i<size; i++) {
      adjacency[i] = new boolean[size];
    }

    // copy the matrix
    for(int i=0; i<size; i++) {
      for(int j=0; j<size; j++) {
        adjacency[i][j] = copy.adjacency[i][j];
      }
    }
  }

  public Vector<String> names;
  public boolean[][] adjacency;
  public int edgeCount;
}