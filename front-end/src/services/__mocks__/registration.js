export default {
  register (detail) {
    return new Promise((resolve, reject) => {
      detail.emailAddress === 'sunny@sadtask.com'
        ? resolve({result: 'success'})
        : reject(new Error('User already exist'))
    })
  }
}
