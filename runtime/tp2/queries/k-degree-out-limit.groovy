#META:
K=50
res = []
t = System.nanoTime();
count = g.V.filter{it.outE.count() >= K}[0..9].store(res).hasNext();
exec_time = System.nanoTime() - t;

//DATABASE,DATASET,QUERY,SID,ITERATION,ORDER,TIME,OUTPUT,PARAMETER1(K_VALUE)
result_row = [ DATABASE, DATASET, QUERY,"0", ITERATION, "0", String.valueOf(exec_time), String.valueOf(res), String.valueOf(K)];
println result_row.join(',');

//g.shutdown();
