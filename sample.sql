select
  l_tax,
  o_clerk
from
  lineitem,
  orders
WHERE
  o_orderkey = l_orderkey
