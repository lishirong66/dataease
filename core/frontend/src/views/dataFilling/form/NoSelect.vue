<template>
  <el-col style="height: 100%">
    <el-empty
      style="padding-top: 202px"
      :image-size="125"
      :image="errImg"
      :description="$t('data_fill.on_the_left')"
    />
  </el-col>
</template>

<script>
export default {
  name: 'DataHome',
  data() {
    return {
      errImg: require('@/assets/None_Select_ds.png')
    }
  }
}
</script>
