
# serverless-aws

- install <a href="https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install-windows.html">SAM CLI</a>
- Using command Line :
```bash
sam init
 ```
- build project : 

```bash 
sam build
```

- local running project :
```bash
sam local invoke HelloWorldFunction --event events://event.json
```

- watch logs:
```bash
sam logs -n HelloWorldFunction --stack-name first-lambda-maven --tail
```

- invoke function:
```bash
aws lambda invoke --invocation-type Event --function-name [function_name] outputfile.txt
```

- start application on local machine :
```bash
sam local start-api
```

- List of policies [[aws](https://docs.aws.amazon.com/fr_fr/serverless-application-model/latest/developerguide/serverless-policy-template-list.html)]























