def call() {
    def config = libraryResource 'config.json'
    echo "$config"
}