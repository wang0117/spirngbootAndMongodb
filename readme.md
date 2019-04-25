# 部署说明 #

## 数据库连接修改 ##

- 修改文件 src\main\resources\config\system.properties

```properties

dbc.jdbcUrl=jdbc\:mysql\://10.72.20.104\:3306/saas_emsvdata

jdbc.user=pbsage

jdbc.password=123456

######################## file.storage.directory linux要注意 #########################
file.storage.directory=D:/develop/tempFile
```

## redis 修改 ##

- 修改文件 src\main\resources\redis\redis.properties

```properties

#hostIP 
jedis.host=10.72.20.104
#用户名
jedis.username=testRedis
#密码
jedis.password=foobared
#port
jedis.port=6379
#jedis database 0-15 默认是0
jedis.database=0



