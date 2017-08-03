 
 
 
 **WePay-微信配置JAVA封装**
 
 
**目标**
 - 不需要过分关注支付本身的支付逻辑 只关注支付过程中具体业务的实现
 
 
 **基本参数的配置**
 - 采用配置文件的方法 增加一个 weChatConfig.properties 配置文件 配置 商户号 等敏感参数
 - 实现PayConfig 接口 后续会被加密处理 业务中的参数另作处理


**执行流程**
 - 考虑到 不管什么业务  对于微信支付来说 他本身的支付流程都是一样的 参见微信的支付文档  不一样的是我们具体项目的支付业务实现
 - 客户参数封装 —— 编写具体的支付相关业务 —— 支付代理类——执行支付处理 ——回调
 - 后台来说就是curd 包括一些反馈之类等等的业务 此处选择用代理支付模式来实现支付跟业务的解耦 只需要实现PreBusinessHandler NextBusinessHandler 来处理业务
 
 **仓库地址**
 - OSC:[https://git.oschina.net/felord/WePay]
 - GitHub:[https://github.com/NotFound403/WePay]
 **QQ**
 - 448129110  欢迎各位大佬提出建议 不胜感激