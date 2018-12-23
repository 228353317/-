<template>
  <div class="panel panel-default">
    <div class="keyword">
      <div class="top-list">题目列表</div>
      <el-input placeholder="请输入关键字" v-model="search" class="input-with-select">
        <el-select v-model="select" slot="prepend" placeholder="请选择" @change="getValue" size="mini">
          <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item">
          </el-option>
        </el-select>
      </el-input>
    </div>

    <div class="panel-body">

      <el-table
        :data="tableData.filter(data => !search || data.knowledge.toLowerCase().includes(search.toLowerCase()))"
        stripe
        @row-click="switchTo('/pages/problems/details')"
        style="width: 100%">
        <el-table-column prop="id" label="编号">
        </el-table-column>
        <el-table-column prop="name" label="标题">
        </el-table-column>
        <el-table-column prop="knowledge" label="知识点">
        </el-table-column>
        <el-table-column prop="ac" label="正确率">
        </el-table-column>
        <el-table-column prop="Total" label="提交量">
        </el-table-column>
      </el-table>

    </div>

  </div>
</template>

<script>
  export default {
    data() {
      return {
        options: [{
          value: '1',
          label: '数组'
        },{
          value: '2',
          label: '函数'
        },{
          value: '3',
          label: '数据结构'
        },{
          value: '4',
          label: '算法'
        },{
          value: '5',
          label: '所有'
        }],
        tableData: [
          {
            id: 1,
            name: "改革春风吹满地",
            knowledge: "算法",
            ac: '22%',
            Total: 20

          },
          {
            id: 2,
            name: "zq",
            knowledge: "函数",
            ac: '20%',
            Total: 10
          },
          {
            id: 3,
            name: "dsfs",
            knowledge: "函数",
            ac: '2%',
            Total: 20
          }
        ],
        search: "",
        select: ""
      }
    },
    methods: {
      getValue: function (value) {
        this.search=value.label!="所有"?value.label:""
      },
      switchTo(path){
        // 通过代码修改路由地址
        this.$router.replace(path);
      }
    }
  }
</script>

<style scoped lang="less">
  .panel-default{
    margin: 0 15px;
    /deep/.keyword{
      overflow: hidden;
      width: 100%;
      margin: 5px 20px ;
      .top-list{
        font-size: 15px;
        float: left;
      }
      .input-with-select{
        overflow: hidden;
        width: 250px;
        float: right;
        margin-right: 30px;
        .el-input__inner{
          height: 25px;
          width: 150px;
        }
        .el-input-group__prepend{
          .el-select--mini{
            .el-input__inner{
              width: 100px;
            }
          }
        }
      }

    }
    /deep/.panel-body{
      .cell{
        text-align: center;
      }
      .el-table__body{
        .el-table__row{
           height: 30px;
           td{
             padding: 5px 0;
             height: 30px;
           }
        }
      }

    }



  }

  /deep/.input-with-select .el-input-group__prepend {
    background-color: #fff;
  }
</style>
