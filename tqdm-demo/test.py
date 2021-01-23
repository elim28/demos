from tqdm import tqdm
from time import sleep
from tqdm import trange

#每部分代码去掉#号注释即可运行

if __name__ == '__main__':

    '''
    1.通过任何的迭代器使用
    '''
    # text = ''
    # for char in tqdm(['t','q','d','','m']):
    #     sleep(0.25)
    #     text = text + char
    
    # print(text)

    '''
    2.通过trange()方法使用
    '''
    # for i in trange(100):
    #     sleep(0.01)

    '''
    3.定义外部循环来控制tqdm
    '''
    # pbar = tqdm(['t','q','d','m'])
    # for char in pbar:
    #     sleep(0.25)
    #     pbar.set_description('Processing %s' % char)
    

    '''
    4. 手动控制tqdm的更新.进度为100每次循环手动更新10
    若每次更新的值大于total的值,则进度条无法正常显示
    若不用with语句,则在最后需要关闭tqdm.
     pbar = tqdm(total=100)
     for i in range(10):
         sleep(0.1)
         pbar.update(10)
     pbar.close()
    '''
    # with tqdm(total=100) as pbar:
    #     for i in range(10):
    #         sleep(0.5)
    #         pbar.update(10)

    '''
    5.进度条嵌套使用
    '''
    # for i in trange(4, desc='1st loop'):
    #     for j in trange(100, desc='2st loop'):
    #         sleep(0.02)


        
