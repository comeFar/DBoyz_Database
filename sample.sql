select
	l_shipdate
from
	lineitem
where
	l_returnflag = 'R'
