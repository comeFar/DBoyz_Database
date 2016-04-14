select
	ps_partkey,
	s_nationkey
from
	supplier,
	nation
where
  s_nationkey = n_nationkey
	and n_name = 'JORDAN';