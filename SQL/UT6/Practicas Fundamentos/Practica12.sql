SELECT object_name AS nombre_objeto, object_type AS tipo_objeto, status AS estado
FROM user_objects 
WHERE object_type IN ('PROCEDURE', 'FUNCTION')
ORDER BY object_type, object_name;