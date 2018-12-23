import Vue from 'vue'
import Router from 'vue-router'

import home from '../pages/index'
import problemslist from '../pages/problemslist/problemslist'
import problemsdetails from '../pages/problemslist/problemsdetails'
import problemsstatus from '../pages/problemslist/problemsstatus'

Vue.use(Router);


export default new Router({
  routes:[
    {path: '/', redirect: '/pages/index'},
    {path:'/pages/index',component: home},
    {path:'/pages/problems/list',component: problemslist},
    {path:'/pages/problems/details',component: problemsdetails},
    {path:'/pages/problems/status',component: problemsstatus}
  ]
})
