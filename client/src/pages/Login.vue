<template>
    <b-row id="mainBody" class="bg-secondary">
        <b-col cols="12" md="4" offset-md="4" id="login">
            <b-form class="my-5 p-5 rounded bg-white" @submit.prevent="login">
                <h1 class="text-center">Login</h1>
                <hr/>
                <label for="username" class="py-2" >Username:</label>
                <b-form-input id="username" size="lg" type="text" placeholder="Username" class="mb-4" v-model="username"></b-form-input>
                <label for="password" class="py-2">Password:</label>
                <b-form-input id="password" size="lg" type="password" placeholder="Password" class="mb-4" v-model="password"></b-form-input>
                <b-button type="submit" block size="lg" variant="primary">Login</b-button>
            </b-form>
        </b-col>
    </b-row>
</template>

<script>
import axios from 'axios'

export default {

    data() {
        return{
            username: '',
            password: '',
            success: false
        }

    },

    methods: {
        login(){
            axios
                .post("/login", {
                    username: this.username,
                    password: this.password
                }, {
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded'
                        }
                    }).then(response => {
                    console.log(response);
                    //either login successful or unsucessful
                    if(response.data.success){
                        success = true; //login successful
                    }
                    else{
                        success = false; //failed to log in
                    }
                }).catch(error => {
                    console.log(error);
                })
           
        }
    }

}

</script>

<style>
    #login h1{
        font-size:38pt;
    }
    #login label{
        font-size:16pt;
    }
</style>

