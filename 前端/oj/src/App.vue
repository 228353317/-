<template>
  <div>
    <NavBar></NavBar>
    <div id="content-app">
        <router-view></router-view>
    </div>
  </div>


</template>

<script>
  import NavBar from './components/NavBar'

  export default {
    data(){
      return{
        msg:"我是标题"
      }
    },
    components:{NavBar}
  }
</script>

<style lang="less">
  * {
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
  }

  .content-app {
    margin-top: 54px;
  }
  .fadeInUp-enter-active {
    animation: fadeInUp .8s;
  }
</style>
