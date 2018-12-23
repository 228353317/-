<template>
  <div class="navbar">
    <div class="navbar-log">
      <h1><img src="../assets/image/logo.png"  /></h1>
    </div>
    <el-menu
      :default-active="activeIndex2"
      class="el-menu-demo nav"
      mode="horizontal"
      @select="handleSelect"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b">
      <el-menu-item index="/pages/index" >首页</el-menu-item>
      <el-menu-item index="/pages/problems/list"  >题目</el-menu-item>
      <el-menu-item index="3" >查询</el-menu-item>
      <el-menu-item index="4" >考试</el-menu-item>
      <div >
        <a href="#">登陆</a>
        <a href="#">注册</a>
      </div>
    </el-menu>
  </div>

</template>

<script>
  export default {
    data() {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        // 通过代码修改路由地址
        this.$router.replace(key);
        // console.log(key, keyPath);
      }
    }
  }
</script>

<style lang="less">
  .navbar{
    .navbar-log{
      height:40px;
      line-height: 40px;
      background-color:#545c64;
      margin: 0;
      padding: 0 15px;
      float: left;
      font-size: 20px;
      font-weight: 400;
      img{
        height:40px;
        vertical-align:text-bottom;
      }
    }
    .nav{
      height: 40px;
      overflow: hidden;
      /*padding-left: 150px;*/
      background: transparent;
      padding:0;
      margin:0;
      .el-menu-item{
        height: 40px;
        font-size: 10px;
        line-height: 40px;
      }
      div{
        overflow: hidden;
        float: right;
        a{
          margin-right: 15px;
          color: #FFFFFF;
          height: 40px;
          font-size: 10px;
          line-height: 40px;
        }
      }
    }
  }

</style>
