# receive-yml-attribute
### 获取yml配置文件内的数据
```yaml
config-attributes:
  value: 345                          #对应单个值
  valueArray: 1,2,3,4,5,6,7,8,9      #对应数组
  valueList:                         #对应list
    -13579
    -246810
  valueMap:                          #对应map
    name: lili
    age: 20
    sex: female
  valueMapList:                      #对应list<map>
    - name: bob
      age: 21
    - name: caven
      age: 31
```

### 需要注意启动类上多了一@ConfigurationProperties注解

### [相关文档的传送门](https://juejin.im/post/5b0440a5f265da0b886dc2e9)
