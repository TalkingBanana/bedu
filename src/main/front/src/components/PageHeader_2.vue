<!-- PageHeader.vue -->
<template>
  <header>
    <div id="nav1" class="bedu-header">
      <router-link to="/">
        <img src="@/assets/imgs/Logo.png" width="150">
      </router-link>
      <div class="dropdown" @mouseenter="openDropdown" @mouseleave="closeDropdown">
        <a class="dropdown-toggle no-arrow" type="button" id="dropdownMenuButton1" :aria-expanded="isDropdownOpen" @click="navigateTo('/lectureField')">
          분야별 강의
        </a>
        <ul class="dropdown-menu" v-show="isDropdownOpen" aria-labelledby="dropdownMenuButton1">
          <li v-for="item in categories" :key="item.title">
            <a style="cursor: pointer;" class="dropdown-item" @click="categoryChange(item)">{{ item.title }}</a>
          </li>
        </ul>
      </div>
      <router-link to="/community" class="bedu-head-cate">커뮤니티</router-link>
      <router-link to="/review" class="bedu-head-cate">수강후기</router-link>
      <router-link to="/companyStudy" class="bedu-head-cate">기업교육</router-link>
      
      <div class="search-popup">
        <div class="border-3 rounded-pill p-2 d-flex align-middle text-center m-auto border-bedu">
          <font-awesome-icon class="m-auto mx-3" :icon="['fas', 'magnifying-glass']" />
          <b-form-input class="border-0 me-2"></b-form-input>
        </div>
      </div>
      <div>
        <router-link to="/login" class="bedu-head-cate2">로그인</router-link>
        <router-link to="/regist" class="bedu-head-cate2">회원가입</router-link>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: 'PageHeader',
  data() {
    return {
      categories: [
        {
          title: '기초 강의',
          value: 'base'
        },
        {
          title: '데이터 분석',
          value: 'data'
        },
        {
          title: '웹 개발',
          value: 'web'
        },
        {
          title: '프로그래밍 언어',
          value: 'lang'
        },
        {
          title: '인공지능',
          value: 'ai'
        },
        {
          title: '프로그래밍 교양',
          value: 'programming'
        },
        {
          title: '개발 도구',
          value: 'tools'
        },
        {
          title: '프로그래밍 전공 지식',
          value: 'major'
        },
        {
          title: '디자인',
          value: 'design'
        }
      ]
    };
  },
  methods: {
    categoryChange(item) {
      this.$router.push({
        name: 'course',
        query: {
          category: item.value,
          korCategory: item.title
        }
      });
    },
    navigateTo(route) {
      this.$router.push(route);
    }
  }
};
</script>

<style scoped>
header {
  background-color: #EDC268;
  display: flex;
  width:100%;
  position:absolute;
  justify-content: center;
  height: 7rem; 
}

.bedu-header {
  display: flex;
  align-items: center;
  width: 100%;
  margin: 0 5.5rem;
  max-width: 125rem;
}
.dropdown:hover .dropdown-menu {
  display: block;
  margin-top: 2px;
}

#nav1 .bedu-head-cate {
  font-family: 'Noto Sans CJK KR', sans-serif;
  font-weight: bold;
  color: #2c3e50;
  text-decoration: none;
  margin-left: 1.5rem;
}
.bedu-header .search-popup {
  align-items: center;
  display: inline-block;
}
.bedu-header .search-popup input {
  width: 100%;
  height: 15px;
  border: none;
  background-color: #F6E0B3;
  border-radius: 30px;
}
.border-bedu {
  background-color: #F6E0B3;
  width: 70%;
  border-color: #EDC268;
}

.no-arrow::after {
  display: none;
}
</style>