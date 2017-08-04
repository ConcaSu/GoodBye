lines = open('E:\\java_web_works\\GoodBye\\build.xml', 'r').readlines()
lines[1] = lines[1].replace("help","build")
open('E:\\java_web_works\\GoodBye\\build.xml', 'w').writelines(lines)
print('执行完毕')