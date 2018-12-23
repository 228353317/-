<template>
  <div class="program program-default">
    <div class="program-body content">
      <div class="program-title"> 改革春风吹满地</div>
      <div class="program-body subject">
        <!-- 题目 -->
        <div class="describe">
          <p>"改革春风吹满地,</p>
          <p>不会AC没关系;</p>
          <p>实在不行回老家，</p>
          <p>还有一亩三分地。</p>
            <p>谢谢!（乐队奏乐）"</p>

            <p>话说部分学生心态极好，每天就知道游戏，这次考试如此简单的题目，也是云里雾里，而且，还竟然来这么几句打油诗。</p>
            <p>好呀，老师的责任就是帮你解决问题，既然想种田，那就分你一块。</p>
            <p>这块田位于浙江省温州市苍南县灵溪镇林家铺子村，多边形形状的一块地，原本是linle 的，现在就准备送给你了。不过，任何事情都没有那么简单，你必须首先告诉我这块地到底有多少面积，如果回答正确才能真正得到这块地。</p>
            <p>发愁了吧？就是要让你知道，种地也是需要AC知识的！以后还是好好练吧...</p>
        </div>

        <div class="describe">
          <h3>输入格式：</h3>
          <p>输入数据包含多个测试实例，每个测试实例占一行，每行的开始是一个整数n(3<=n<=100)，它表示多边形的边数（当然也是顶点数），然后是按照逆时针顺序给出的n个顶点的坐标（x1, y1, x2, y2... xn, yn）,为了简化问题，这里的所有坐标都用整数表示。</p>
          <p>输入数据中所有的整数都在32位整数范围内。</p>
        </div>

        <div class="describe">
          <h3>输出格式：</h3>
          <p>对于每个测试实例，请输出对应的多边形面积，结果精确到小数点后一位小数。</p>
          <p>每个实例的输出占一行。</p>
        </div>

        <div class="describe">
          <h3>输入样例：</h3>
          <p>3 0 0 1 0 0 1</p>
          <p>4 1 0 0 1 -1 0 0 -1</p>
        </div>

        <div class="describe">
          <h3>输出样例：</h3>
          <p>0.5</p>
          <p>2.0</p>
        </div>


        <form action="#">
            <div class="input-group-btn">
              请选择使用的编程器：共 4 种编译器可用
              <el-select v-model="select" slot="prepend" placeholder="请选择" size="mini">
                <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item">
                </el-option>
              </el-select>
            </div>
          <div class="text-center">
            <el-input
              type="textarea"
              :rows="12"
              placeholder="请提交代码"
              v-model="textarea">
            </el-input>
          </div>
          <div class="codesubmit">
            <el-button type="success" :disabled="textarea==''" @click="switchTo('/pages/problems/status')">提交</el-button>
            <el-button type="primary" @click="switchTo('/pages/problems/list')">返回</el-button>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          options: [{
            value: '1',
            label: 'gcc'
          }, {
            value: '2',
            label: 'Java'
          }, {
            value: '3',
            label: 'python2'
          }, {
            value: '4',
            label: 'python3'
          }],
          select: "gcc",
          textarea: ''
        }
      },
      methods: {
        switchTo(path){
          // 通过代码修改路由地址
          this.$router.replace(path);
        }
      }
    }
</script>

<style scoped lang="less">
  .program-title{
    font-size: 20px;
    font-weight: bold;
    text-align: center;
  }
  .describe{
    margin: 0 15px;
    p{
      text-indent: 2em;
      font-size: 10px;
      margin: 10px 0;
    }
    h3{
      font-size: 12px;
      font-weight: bold;
    }
  }
  form{
    margin: 0 15px;
    .input-group-btn{
      margin: 4px 0;
      .el-select{
        margin:0 5px;
        width: 100px;
        .el-input__inner{
          height: 25px;
          width: 100px;
        }
      }
    }
    /deep/.text-center {
      text-align: center;
      .el-textarea {
        width: 500px;
        .el-textarea__inner {
          margin: 0 auto;;
          width: 400px;
        }
      }
    }
  }
  .input-group-btn{
    font-size: 12px;
  }
  .codesubmit{
    text-align: center;
    margin-top: 10px;
    margin-bottom: 100px;
  }

</style>
