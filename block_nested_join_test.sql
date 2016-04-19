select
  c_name,
  n_name,
  s_name
from
  customer,
  nation,
  supplier
WHERE
  c_nationkey = n_nationkey
  and s_nationkey = n_nationkey
  and n_nationkey = 1