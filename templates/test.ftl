string : ${test}
value : ${value}
int_value: #{int_value}

<#list value_list as val>
  ${val.name}: ${val.age}
</#list> 
