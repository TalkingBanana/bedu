<template>
    <div class="p-5">
        <b-container>

            <!-- 기초 강의 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">기초 강의</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('base','기초 강의')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in base" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 데이터 분석 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">데이터 분석</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('data','데이터 분석')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4  class="mb-5">
                    <b-col v-for="(item, i) in data" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 웹 개발 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">웹 개발</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('web','웹 개발')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in web" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 프로그래밍 언어 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">프로그래밍 언어</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('lang','프로그래밍 언어')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in lang" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 인공지능 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">인공지능</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('ai','인공지능')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in ai" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 프로그래밍 교양 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">프로그래밍 교양</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('programming','프로그래밍 교양')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in programming" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 개발 도구 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">개발 도구</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('tools','개발 도구')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in tools" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 프로그래밍 전공 지식 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">프로그래밍 전공 지식</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <b-link class="text-decoration-none text-secondary" @click="watchList('major','프로그래밍 전공 지식')">· 더보기</b-link>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in major" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>

            <!-- 디자인 탑4-->
            <div class="fs-5 d-flex mb-3">
                <span class="me-auto">
                    <b-link class="text-decoration-none text-danger fw-bold">디자인</b-link>에서 인기 있는 강좌
                </span>
                <span class="ms-auto">
                    <span class="text-decoration-none text-secondary" @click="watchList('design','디자인')">· 더보기</span>
                </span>
            </div>
            <div>
                <b-row cols=4 class="mb-5">
                    <b-col v-for="(item, i) in design" :key="i">
                        <b-link class="text-decoration-none text-body" :to='"/lectureDetail?num="+item.num'>
                            <div class="border-1 border-opacity-10">
                            <img :src="item.thumbnail" >
                            <b-container class="p-4 border">
                                <div>
                                <p class="fw-bold">{{ item.title }}</p>
                                </div>
                                <p class="fw-bold"> <span  class="teacher-name">{{ item.teacher }} 선생님</span><span> 총 {{ item.total }}강</span></p>
                                <p class="text-secondary fs-6">수강기간:{{ item.duration }}일</p>
                                <div class="text-center">
                                <b-button class="w-100" variant="outline-dark">수강신청</b-button>
                                </div>
                            </b-container>
                            </div>
                        </b-link>
                    </b-col>
                </b-row>
            </div>
            
        </b-container>
    </div>
</template>

<script>
export default{
    name : 'LectureField',
    data() {
        return {
            base: [],
            data : [],
            web : [],
            lang : [],
            ai : [],
            programming: [],
            tools : [],
            major : [],
            design : []
        }
    },
    methods: {
        getLectures(){
            this.$axios.get('/api/getLectureField')
            .then((res)=>{
                this.base = res.data.base;
                this.data = res.data.data;
                this.web = res.data.web;
                this.lang = res.data.lang;
                this.ai = res.data.ai;
                this.programming = res.data.programming;
                this.tools = res.data.tools;
                this.major = res.data.major;
                this.design = res.data.design;
            })
            .catch((err)=>{
                console.log(err)
            });
        },
        watchList(category, korCategory){
            this.$router.push({
                name : 'course',
                query : {
                    category : category,
                    korCategory : korCategory
                }
            })
        }
    },
    created() {
        
    },
    mounted() {
        this.getLectures();
    },
}

</script>


<style scoped>
img{
  width: 100%;
  height: 150px;
}
</style>