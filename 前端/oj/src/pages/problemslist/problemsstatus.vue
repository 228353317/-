<template>
  <div class="panel panel-default">
    <div class="keyword">
      <div class="top-list">运行结果</div>
      <el-input placeholder="请输入关键字" v-model="search" class="input-with-select">
      </el-input>
    </div>

    <div class="panel-body">

      <el-table
        :data="tableData.filter(data => !search || data.useid.toLowerCase().includes(search.toLowerCase()))"
        :default-sort = "{prop: 'when', order: 'descending'}"
        :cell-class-name="tableRowClassName"
        style="width: 100%">
        <el-table-column prop="when" label="提交时间">
        </el-table-column>
        <el-table-column prop="useid" label="用户账号">
        </el-table-column>
        <el-table-column prop="id" label="题目编号">
        </el-table-column>
        <el-table-column prop="status" label="状态">
        </el-table-column>
        <el-table-column prop="time" label="运行时间">
        </el-table-column>
        <el-table-column prop="Memory" label="代码长度">
        </el-table-column>
        <el-table-column prop="Language" label="语言">
        </el-table-column>
      </el-table>

    </div>

  </div>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [
          {
            when: "2018-12-18 17:56:32",
            useid:"211606100",
            id: 1,
            status: "答案正确",
            time: "0ms",
            Memory: '150k',
            Language: "gcc",
            color:"#f00"

          },
          {
            when: "2018-12-19 20:18:30",
            useid:"211606101",
            id: 1,
            status: "答案错误",
            time: "0ms",
            Memory: '1M',
            Language: "gcc",
            color:"#f00"
          },
          {
            when: "2018-12-20 7:00:30",
            useid:"211606102",
            id: 1,
            status: "答案错误",
            time: "0ms",
            Memory: '1K',
            Language: "gcc",
            color:"#f00"
          },
          {
            when: "2018-12-21 14:56:00",
            useid:"211606101",
            id: 1,
            status: "编译中",
            time: "0ms",
            Memory: '1K',
            Language: "gcc",
            color:"#f00"
          },
        ],
        search: "",
        select: ""
      }
    },
    methods: {
      switchTo(path){
        // 通过代码修改路由地址
        this.$router.replace(path);

      },
      tableRowClassName({row, column, rowIndex, columnIndex}) {
        if(columnIndex === 3){
          console.log(row.status);
          if (row.status === "编译中") {
            return 'runing-row';
          } else if (row.status === "答案正确") {
            return 'success-row';
          } else if (row.status === "编译错误") {
            return 'error-row';
          } else if (row.status === "答案错误") {
            return 'error-row';
          } else if (row.status === "编译错误") {
            return 'warning-row';
          } else if (row.status === "部分正确") {
            return 'success-row';
          }
        }
        return '';
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
      .el-table .warning-row {
        color: #92fd2d;
      }
      .el-table .runing-row {
        color: #45b6f9;
      }
      .el-table .error-row {
        color: #f9451a;
      }

      .el-table .success-row {
        color: #92fd2d;
      }
      .cell{
        text-align: center;
        font-size: 8px;
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
