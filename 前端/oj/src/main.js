
import './assets/css/base.css'
import '../static/css/reset.css'
import 'element-ui/lib/theme-chalk/index.css'
import $ from 'jquery'
import Vue from 'vue'
import { Button, Select ,Menu,menuItem,Table,tableColumn,Input,Option} from 'element-ui'


Vue.component(Button.name, Button);
Vue.component(Select.name, Select);
Vue.component(Menu.name, Menu);
Vue.component(menuItem.name, menuItem);
Vue.component(Input.name, Input);
Vue.component(Option.name, Option);
Vue.component(Table.name, Table);
Vue.component(tableColumn.name, tableColumn);
import App from './App'
import router from './router/index'


Vue.config.productionTip = false


new Vue({
  el: '#app',
  // router,
  components: { App },
  template: '<App/>',
  router:router
})
