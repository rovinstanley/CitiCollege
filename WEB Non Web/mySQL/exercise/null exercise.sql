SELECT employee_name, employee_phone_no FROM employeedb.employeedetail
WHERE employee_address IS NOT NULL 
AND
employee_phone_no IS NOT NULL
ORDER BY employee_name;
